package com.gaoxing.lesson05;

public class Employee {
	String name;
	public Employee(String name){
		this.name = name;
	}
	
//	public void sysoOut(SysoHeiBai heibai){
//		heibai.show(name,"员工开除名单");
//	}
//	
//	public void sysoOut(SysoCai cai){
//		cai.show(name,"如何瓜分公司财产");
//	}
	
	public void sysoOut(SysoFather prin) {
		if(prin instanceof SysoHeiBai) {
			prin.show(name,"员工开除名单");
		}else if(prin instanceof SysoCai) {
			prin.show(name,"如何瓜分公司财产");
		}
	}
	
	public void huan(SysoFather prin) {
		if(prin instanceof SysoHeiBai) {
			SysoHeiBai heibai = (SysoHeiBai)prin;
			heibai.reSrcOfHeibai(this.name);
		}else if(prin instanceof SysoCai) {
			SysoCai cai = (SysoCai)prin;
			cai.reSrcOfCai(this.name);
		}
	}
}
