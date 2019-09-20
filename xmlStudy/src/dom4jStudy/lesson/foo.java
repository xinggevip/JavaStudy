package dom4jStudy.lesson;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;


public class foo {
	// 读取xml元素内容和元素属性
	public static void read(Document doc) {
		// 1.获取根元素
		Element rootEle = doc.getRootElement();
		// 2.通过根元素获取元素集合
		List<Element> stulist = rootEle.elements("student");
		// 3.遍历集合
		for (Element stuEle : stulist) {
//			Element name = stuEle.element("name");
//			System.out.println(name.getText());  // 高星 tom
			
			// 获取元素中的文本内容
			String name = stuEle.elementText("name");
			String age = stuEle.elementText("age");
			String sex = stuEle.elementText("sex");
			// 获取属性值
			String number = stuEle.attributeValue("number");
			System.out.println(name + age + sex + number); // 高星300男s1 tom19女s2
		}
		
	}
	
	// 添加元素
	public static void add(Document doc) throws IOException {
		// 1.获取根元素
		Element rootElement = doc.getRootElement();
		// 2.添加student元素，设置属性
		Element stuEle = rootElement.addElement("student").addAttribute("number", "s3");
		// 3.利用student元素添加子元素，设置值
		stuEle.addElement("name").setText("孔子");
		stuEle.addElement("age").setText("88");
		stuEle.addElement("sex").setText("男");
		
		// 4.同步操作
		
		// Pretty print the document to System.out
        OutputFormat format = OutputFormat.createPrettyPrint();
        Writer wr =new OutputStreamWriter(new FileOutputStream("src\\xmlStudy\\lesson\\NewFile.xml"),"utf-8");
        XMLWriter writer = new XMLWriter(wr, format);
        writer.write( doc );
        wr.close();
		
		
//		Writer wr =new OutputStreamWriter(new FileOutputStream("src\\xmlStudy\\lesson\\NewFile.xml"),"utf-8");
//		doc.write(wr);
//		wr.close();
	}

	public static void main(String[] args) throws DocumentException, IOException {
		SAXReader reader = new SAXReader();
		Document doc = reader.read("src\\xmlStudy\\lesson\\NewFile.xml");
		
		// 读取xml元素内容和元素属性
		read(doc);
		// 添加元素，设置属性，设置值
		add(doc);

	}

}
