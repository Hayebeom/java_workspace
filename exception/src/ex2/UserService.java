package ex2;

public class UserService extends CommonService {
	
	private UserRepository repo = new UserRepository();
	
	public void addNewUser(String id, String name, String pwd) throws HTAException { // 런타임 예외면  throws HTAException 삭제 가능 
		User savedUser = repo.getUserById(id);
		
		if(savedUser != null) {
//			System.out.println("동일한 아이디가 존재합니다.");
//			return;
//			throw new HTAException("[" + id + "]는 이미 사용중인 아이디입니다.");
//			throw new DuplicatedUserIdException(id);
//			throw new HTAException("ERROR_USER_001", id);
			processError("ERROR_USER_001", id);
		}
		
		User user = new User(id, name, pwd);
		repo.insert(user);
		
	}
	
	public void login(String id, String pwd) throws HTAException {
		User user = repo.getUserById(id);
		if (user == null) {
//			throw new HTAException(아이디 혹은 비밀번호가 일치하지 않습니다.");
//			throw new UserNotFoundException(id);
//			throw new HTAException("ERROR_USER_002", id);
			processError("ERROR_USER_002", id);
		}
		
		if (!user.getPwd().equals(pwd)) {
//			throw new HTAException(아이디 혹은 비밀번호가 일치하지 않습니다.");
//			throw new PasswordNotEqualException(id);
//			throw new HTAException("ERROR_USER_003", pwd);
			processError("ERROR_USER_003", pwd);
		}
		
		// 로그인 관련 처리 수행
		
	}
	
	public void changePassword(String id, String oldPwd, String newPwd) throws HTAException {
		User user = repo.getUserById(id);
		if(user == null) {
//			throw new HTAException(아이디 혹은 비밀번호가 일치하지 않습니다.");
//			throw new UserNotFoundException(id);
//			throw new HTAException("ERROR_USER_002", id);
			processError("ERROR_USER_002", id);
		}

		if(!user.getPwd().equals(oldPwd)) {
//			throw new HTAException(아이디 혹은 비밀번호가 일치하지 않습니다.");
//			throw new PasswordNotEqualException(id);
//			throw new HTAException("ERROR_USER_003", oldPwd);
			processError("ERROR_USER_003", oldPwd);
		}
		
		user.setPwd(newPwd);
	}
	
}
