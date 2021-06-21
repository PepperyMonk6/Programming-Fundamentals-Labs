package lab7_exercise3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentTracker {
	private List<Student> studentList;
	private Map<Integer, Student> moduleList;
	
	public StudentTracker() {
		studentList = new ArrayList<Student>();
		moduleList = new HashMap<Integer, Student>();
	}
	
	public void addStudent(Student student, List<Module> moduleList) {
		for(Module module : moduleList) {
			student.addModuleList(module);
		}
		studentList.add(student);
	}
	
	public String printStudents() {
		String result = "";
		for(int i = 0; i < studentList.size(); i++) {
			if(studentList.get(i) != null) {
				result += studentList.get(i) + "\n";
			}
		}
		return result;
	}
	
	private void initialiseMap() {
		for(int i = 0; i < studentList.size(); i++) {
			moduleList.put(studentList.get(i).getUrn(), studentList.get(i));
		}
	}
	
	public String printModules(int urn) {
		this.initialiseMap();
		String result2 = "";
		List<Module> studentModules = moduleList.get(urn).getModule();
			result2 += "URN " + urn + " is enrolled in:\n";
			for(int i = 0; i < studentModules.size(); i++) {
				if(i == studentModules.size() - 1) {
					result2 += studentModules.get(i);
				} 	else {
					result2 += studentModules.get(i) + ", ";
				}
			}
		return result2;
	}
}
