package com.gaoxing.lesson09;

import java.awt.image.Raster;

/**
 * 本程序有两种变化维度，第一种是拍摄设备的变化维度，第二种是拍摄对象的变化维度，
 * @author xingge
 *
 */

// 外观接口
// 物体实现接口类
// 创建物体对象
interface Target{
	String getOutLook();
}

class Fengjing implements Target {

	public String getOutLook() {
		return "优美得风景";
	}
	
}

class Yangmi implements Target {
	public String getOutLook() {
		return "杨幂";
	}
}


// 拍照接口
// 拍照设备实现接口类
// 创建设备对象
interface Photographable{
	void takePhoto(Target target);
}

class Iphone implements Photographable{

	public void takePhoto(Target target) {
		if (target instanceof Fengjing) {
			System.out.println("用iphone对" + target.getOutLook() + "进行拍照");
		}else if (target instanceof Yangmi) {
			System.out.println("用iphone对" + target.getOutLook() + "进行拍照");
		}
	}
	
}

class Camera implements Photographable{
	public void takePhoto(Target target) {
		if (target instanceof Fengjing) {
			System.out.println("用照相机对" + target.getOutLook() + "进行拍照");
		}else if (target instanceof Yangmi) {
			System.out.println("用照相机对" + target.getOutLook() + "进行拍照");
		}
	}
}




// 创建摄影师类
// 创建摄影师对象

class PhotoPher{
	String name;
	public PhotoPher(String name) {
		this.name = name;
	}
	
	void paiZhao(Photographable shebei,Target thing) {
		if (shebei instanceof Iphone) {
			System.out.print(name + "正在");
			shebei.takePhoto(thing);
		}else if(shebei instanceof Camera){
			System.out.print(name + "正在");
			shebei.takePhoto(thing);
		}
	}
	
}

public class TestCamaer {

	public static void main(String[] args) {
		// 创建风景,创建拍摄设备,创建摄影师
		
		// 创建一个风景对象
		Target fengjing1 = new Fengjing();
		// 创建一个人对象
		Target meinv1 = new Yangmi();
		// 创建一个iphone对象
		Photographable iphone1 = new Iphone();
		// 创建一个照相机对象
		Photographable camera1 = new Camera();
		// 创建一个摄影师对象
		PhotoPher p1 = new PhotoPher("柯南");
		p1.paiZhao(iphone1, meinv1);
		
		PhotoPher p2 = new PhotoPher("小兰");
		p2.paiZhao(camera1, fengjing1);
		

	}

}
