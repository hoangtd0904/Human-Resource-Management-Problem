package humanResourceManagementProblem;

import java.util.Arrays;

/**
 * @overview: Employee is a candidate that need to satisfy 'ability about
 *            project', 'technical skill' that match project, 'experience' about
 *            project /\ Employee identify by 'employee Id' and is considered by
 *            attitude and responsibility
 * @note: all stat define max by 10
 **/
public class Employee {

	// attribute
	private int employeeId;
	private int technicalSkill, experience, attitude, responsibility, belongTeam;
	private boolean isFree;
	private int[] preferList;

	// constructor
	public Employee(int employeeId, int abilityInProject, 
			int technicalSkill, int experience, int attitude,
			int responsibility, int[] preferList) {

		// att to calculate
		this.isFree = true;
		this.technicalSkill = technicalSkill;
		this.experience = experience;
		this.attitude = attitude;
		this.responsibility = responsibility;

		// att to manage
		this.belongTeam = -1;
		this.employeeId = employeeId;
		this.preferList = preferList; // prefer list from input
	}

//	getter & setter
	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public int getTechnicalSkill() {
		return technicalSkill;
	}

	public void setTechnicalSkill(int technicalSkill) {
		this.technicalSkill = technicalSkill;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public int getAttitude() {
		return attitude;
	}

	public void setAttitude(int attitude) {
		this.attitude = attitude;
	}

	public boolean isFree() {
		return isFree;
	}

	public void setFree(boolean isFree) {
		this.isFree = isFree;
	}

	public int getResponsibility() {
		return responsibility;
	}

	public void setResponsibility(int responsibility) {
		this.responsibility = responsibility;
	}

	public int[] getPreferList() {
		return preferList;
	}

	public void setPreferList(int[] preferList) {
		this.preferList = preferList;
	}

	public int getBelongTeam() {
		return belongTeam;
	}

	public void setBelongTeam(int belongTeam) {
		this.belongTeam = belongTeam;
	}

//	test
	public static void main(String[] args) {
		Team team = new Team(23, 8, 7, 7, 6, 5, 4, new int[] {});
		Employee employee = new Employee(1,5,6,8,4,9,new int[] {11,19,10,23});
		System.out.println(Arrays.toString(employee.getPreferList()));
	}
} // end class
