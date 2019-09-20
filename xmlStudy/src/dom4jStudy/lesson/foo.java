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
	// ��ȡxmlԪ�����ݺ�Ԫ������
	public static void read(Document doc) {
		// 1.��ȡ��Ԫ��
		Element rootEle = doc.getRootElement();
		// 2.ͨ����Ԫ�ػ�ȡԪ�ؼ���
		List<Element> stulist = rootEle.elements("student");
		// 3.��������
		for (Element stuEle : stulist) {
//			Element name = stuEle.element("name");
//			System.out.println(name.getText());  // ���� tom
			
			// ��ȡԪ���е��ı�����
			String name = stuEle.elementText("name");
			String age = stuEle.elementText("age");
			String sex = stuEle.elementText("sex");
			// ��ȡ����ֵ
			String number = stuEle.attributeValue("number");
			System.out.println(name + age + sex + number); // ����300��s1 tom19Ůs2
		}
		
	}
	
	// ���Ԫ��
	public static void add(Document doc) throws IOException {
		// 1.��ȡ��Ԫ��
		Element rootElement = doc.getRootElement();
		// 2.���studentԪ�أ���������
		Element stuEle = rootElement.addElement("student").addAttribute("number", "s3");
		// 3.����studentԪ�������Ԫ�أ�����ֵ
		stuEle.addElement("name").setText("����");
		stuEle.addElement("age").setText("88");
		stuEle.addElement("sex").setText("��");
		
		// 4.ͬ������
		
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
		
		// ��ȡxmlԪ�����ݺ�Ԫ������
		read(doc);
		// ���Ԫ�أ��������ԣ�����ֵ
		add(doc);

	}

}
