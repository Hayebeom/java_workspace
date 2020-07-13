package data.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.TreeMap;
import java.util.TreeSet;

import data.repo.DataRepo;
import data.vo.Data;

public class DataService {

	private DataRepo repo;

	public DataService() throws Exception {
		repo = new DataRepo();
	}

	// 전체 사고건수, 사망자 수를 출력하는 기능
	public void printAllDataCount() {
		List<Data> datas = repo.getAllData();

		int totalDeath = 0;
		for (Data data : datas) {
			totalDeath += data.getDeath();
		}

		System.out.println("전체 사고건수 : " + datas.size());
		System.out.println("전체 사망자수 : " + totalDeath);
	}

	// 시도를 전달받아서 해당 지역의 사고건수와 사망자 수를 출력하는 기능
	public void printDataBySido(String sido) {
		List<Data> datas = repo.getDatBySido(sido);

		int totalDeath = 0;
		for (Data data : datas) {
			totalDeath += data.getDeath();
		}

		System.out.println("[" + sido + "] 지역 사고 현황");
		System.out.println("전체 사고건수 : " + datas.size());
		System.out.println("전체 사망자수 : " + totalDeath);
	}

	// 날짜를 전달받아서 해당 날짜의 사고건수와 사망자 수를 출력하는 기능
	public void printDataByDay(String day) {
		List<Data> datas = repo.getDataByDay(day);

		int totalDeath = 0;
		for (Data data : datas) {
			totalDeath += data.getDeath();
		}

		System.out.println("[" + day + "] 날짜 사고 현황");
		System.out.println("전체 사고건수 : " + datas.size());
		System.out.println("전체 사망자수 : " + totalDeath);
	}

	// 시도를 전달받아서 해당 지역의 구군별 사고현황 통계를 출력하는 기능
	public void printDataStatBySido(String sido) {
		List<Data> datas = repo.getDatBySido(sido);
		TreeMap<String, Stat> map = new TreeMap<String, Stat>();

		for (Data data : datas) {
			String gugun = data.getGugun();
			int death = data.getDeath();

			if (map.containsKey(gugun)) {
				Stat stat = map.get(gugun);
				stat.setRecords(stat.getRecords() + 1);
				stat.setDeaths(stat.getDeaths() + death);

			} else {
				Stat stat = new Stat();
				stat.setRecords(1);
				stat.setDeaths(death);

				map.put(gugun, stat);
			}
		}

		NavigableSet<String> set = map.navigableKeySet();
		System.out.println("[구군]	사고건수	사망자수");
		for (String key : set) {
			Stat stat = map.get(key);
			System.out.println("[" + key + "]\t" + stat.getRecords() + "\t" + stat.getDeaths());
		}
	}

	// 월별 사고현황 통계를 출력하는 기능
	public void printDataStatByMonth() {
		List<Data> datas = repo.getAllData();
		TreeMap<Integer, Stat> stats = new TreeMap<Integer, Stat>();

		for (Data data : datas) {
			String day = data.getDay(); // "01-01", "02-13"
			String monthString = day.substring(0, 2); // "01" "02"
			int month = 0;

			if (monthString.startsWith("0")) { // 첫글자가 0으로 시작하면 ex.01월 02월
				month = Integer.parseInt(monthString.substring(1)); // 뒷자리만 가져온다 ex.1월 2월
			} else {
				month = Integer.parseInt(monthString); // 둘다 가져온다 ex.11월 12월
			}

			Stat savedStat = stats.get(month); // Map에서 month를 key로 Stat 객체를 조회
			if (savedStat == null) { // 저장된 Stat 객체가 없으면
				Stat stat = new Stat(); // Stat 객체 생성
				stat.setDeaths(data.getDeath()); // 사망자수와 사고건수를 담아서
				stat.setRecords(1);

				stats.put(month, stat); // Map에 month로 Stat를 저장
			} else { // List의 m-1번째에 저장된 Stat 객체가 있으면
				savedStat.setDeaths(savedStat.getDeaths() + data.getDeath());
				savedStat.setRecords(savedStat.getRecords() + 1);
			}
		}
		System.out.println("월\t사고건수\t사망자수");
		System.out.println("==============================================");

		int size = stats.size();
		for (int i = 1; i <= size; i++) {
			Stat stat = stats.get(i);
			System.out.println((i) + "월\t" + stat.getRecords() + "\t" + stat.getDeaths());

		}

	}

	// 요일별 사고현황 통계를 출력하는 기능
	public void printDataStatByDayOfWeek() {

	}

	// 위반내용별 사고현황 통계를 출력하는 기능
	public void printDataStatByViolation() {

	}

	// 사고현황 요약 결과를 출력하는 기능
	public void printDataStat() {
		// 최다 발생 시도, 최다 사고발생 월, 최다 사고 발생일, 최다 사고 발생요일, 최다 사고 발생 유형
		Map<String, Map<String, Stat>> map = new HashMap<String, Map<String, Stat>>();
		map.put("시도별", new HashMap<String, Stat>());
		map.put("월별", new HashMap<String, Stat>());
		map.put("날짜별", new HashMap<String, Stat>());
		map.put("요일별", new HashMap<String, Stat>());
		map.put("사고유형별", new HashMap<String, Stat>());

		Map<String, Stat> sidoMap = map.get("시도별");
		Map<String, Stat> monthMap = map.get("월별");
		Map<String, Stat> dayMap = map.get("날짜별");
		Map<String, Stat> dayOfWeekMap = map.get("요일별");
		Map<String, Stat> violationMap = map.get("사고유형별");

		List<Data> datas = repo.getAllData();

		for (Data data : datas) {
			String sido = data.getSido();
			String month = data.getDay().substring(0, 2);
			String day = data.getDay();
			String dayOfWeek = data.getDayOfWeek();
			String violation = data.getViolation();
			int death = data.getDeath();

			reduceStat(sido, death, sidoMap);
			reduceStat(month, death, monthMap);
			reduceStat(day, death, dayMap);
			reduceStat(dayOfWeek, death, dayOfWeekMap);
			reduceStat(violation, death, violationMap);

		}

		Stat sidoMaxStat = maxStat(sidoMap);
		Stat monthMaxStat = maxStat(monthMap);
		Stat dayMaxStat = maxStat(dayMap);
		Stat dayOfWeekMaxStat = maxStat(dayOfWeekMap);
		Stat violationMaxStat = maxStat(violationMap);

		System.out.println("============================== 교통사고 현황 요약 ==============================");
		System.out.println("구	분 : 	건수	사망자수");
		System.out.println("=========================================================================");
		System.out.println("최다 사고 발생 시도 : \t" + sidoMaxStat.getName() + "\t" + sidoMaxStat.getDeaths());
		System.out.println("최다 사고 발생 월 : \t" + monthMaxStat.getName() + "\t" + monthMaxStat.getDeaths());
		System.out.println("최다 사고 발생 날짜 : \t" + dayMaxStat.getName() + "\t" + dayMaxStat.getDeaths());
		System.out.println("최다 사고 발생 요일 : \t" + dayOfWeekMaxStat.getName() + "\t" + dayOfWeekMaxStat.getDeaths());
		System.out.println("최다 사고 발생 유형 : \t" + violationMaxStat.getName() + "\t" + violationMaxStat.getDeaths());

	}

	private Stat maxStat(Map<String, Stat> map) {
		Collection<Stat> stats = map.values();
		TreeSet<Stat> treeSet = new TreeSet<Stat>(stats);
		return treeSet.last();
	}

	// 우클릭 - Refactor - extract Method
	private void reduceStat(String key, int death, Map<String, Stat> Map) {
		if (Map.containsKey(key)) {
			Stat stat = Map.get(key);
			stat.setRecords(stat.getRecords() + 1);
			stat.setDeaths(stat.getDeaths() + death);
		} else {
			Stat stat = new Stat();
			stat.setName(key);
			stat.setRecords(1);
			stat.setDeaths(death);
			Map.put(key, stat);
		}
	}

	class Stat implements Comparable<Stat> {
		private String name;
		private int records;
		private int deaths;

		public Stat() {

		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Stat(int records, int deaths) {
			super();
			this.records = records;
			this.deaths = deaths;
		}

		public int getRecords() {
			return records;
		}

		public void setRecords(int records) {
			this.records = records;
		}

		public int getDeaths() {
			return deaths;
		}

		public void setDeaths(int deaths) {
			this.deaths = deaths;
		}

		@Override
		public int compareTo(Stat o) {
			return this.deaths - o.deaths;
		}

	}

}
