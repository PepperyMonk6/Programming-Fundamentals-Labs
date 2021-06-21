package lab7_exercise3;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private String name;
	private int urn;
	private List<Module> moduleList = new ArrayList<Module>();
	
	public Student(String name, int urn) {
		this.name = name;
		this.urn = urn;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getUrn() {
		return this.urn;
	}
	
	public List<Module> getModule() {
		return this.moduleList;
	}
	
	public void addModuleList(Module module) {
		if(!moduleList.contains(module)) {
			moduleList.add(module);
		}
	}
	
	public String printModules() {
		String result = "";
		for(int i = 0; i < moduleList.size(); i++) {
			if(i == moduleList.size() - 1) {
				result += moduleList.get(i) + " ";
			}	else {
				result += moduleList.get(i) + ", ";
			}
		}	return result;
	}	

	@Override
	public String toString() {
		return this.getName() + "(" + this.getUrn() + ")";
	}
}
