package encapsulation;

//Plain Old Java Object class ->POJO
//Bean
class UserModel 
{
	private int id;// r
	private String name;// w r
	private String pwd;// w
	private long mob;// w r

	public UserModel() {

	}

	public UserModel(int id, String name, String pwd, long mob) {
		super();
		this.id = id;
		this.name = name;
		this.pwd = pwd;
		this.mob = mob;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public long getMob() {
		return mob;
	}

	public void setMob(long mob) {
		this.mob = mob;
	}
}

class AccntService {
	int id = 1;

	public UserModel createAcnt(String name, String pwd, long mob) {
		UserModel u1 = new UserModel(id, name, pwd, mob);
		id++;
		return u1;
	}

	public void updatePwd(UserModel us1, String newPwd) {
		us1.setPwd(newPwd);
		System.out.println("password changed");
	}

	public void updateMob(UserModel us1, long newMob) {
		us1.setMob(newMob);
		System.out.println("mob number changed");
	}

	public void showMob(UserModel us1) {
		System.out.println(us1.getMob());
	}

	public void showId(UserModel us1) {
		System.out.println(us1.getId());
	}
	
	public void showUser(UserModel us1) 
	{
		System.out.println(us1.getId());
		System.out.println(us1.getName());
		System.out.println(us1.getMob());
	}

}

public class Mainclass 
{
	public static void main(String[] args) 
	{
		AccntService as1 = new AccntService();

		UserModel us1 = as1.createAcnt("Dinga", "dingi", 9876543219l);
		as1.showUser(us1);
	}
}
