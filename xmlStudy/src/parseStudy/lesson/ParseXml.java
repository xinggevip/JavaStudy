package parseStudy.lesson;

import java.io.IOException;

import javax.print.Doc;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ParseXml {
	
	// ��ȡxml�ڵ�����
	public static void read(Document doc) {
		// 4.��ȡ����Ľڵ��б���
		NodeList list = doc.getElementsByTagName("name");
		// 5.��ȡ�����еľ���ĳһ��
		Node name = list.item(0);
		// 6.��ȡ��Ŀ����
		System.out.println(name.getTextContent());
		
	}
	
	// �޸�xml�ڵ�����
	public static void edit(Document doc) throws TransformerFactoryConfigurationError, TransformerException {
		// ��ȡ�ڵ㼯��
		NodeList list = doc.getElementsByTagName("age");
		// ��ȡ���Ͼ���ĳһ��
		Node ageNode = list.item(0);
		// �޸���Ŀ����
		ageNode.setTextContent("300");
		// ���ڴ�д���ĵ���ͬ������
		Transformer tf = TransformerFactory.newInstance().newTransformer();
		tf.transform(new DOMSource(doc), new StreamResult("src/xmlStudy/lesson/NewFile.xml"));
		
	}
	
	// ���xml�ڵ�
	public static void add(Document doc) throws TransformerFactoryConfigurationError, TransformerException {

		// 1.����Ԫ��
		Element addressEle = doc.createElement("address");
		addressEle.setTextContent("�Ϻ�");
		// 2.��ȡ�ڵ��б�
		// 3.��ȡ�ڵ��б��е�ָ����
		Node list = doc.getElementsByTagName("student").item(0);
		// 4.��Ԫ����ӽ�ָ���ڵ�
		list.appendChild(addressEle);
		// 5.���ڴ������ͬ����xml
		Transformer tf = TransformerFactory.newInstance().newTransformer();
		tf.transform(new DOMSource(doc), new StreamResult("src/xmlStudy/lesson/NewFile.xml"));
	
	}
	
	// ɾ���ڵ�
	public static void del(Document doc) throws TransformerFactoryConfigurationError, TransformerException {
		// 1.��ȡҪɾ���Ľڵ�
		Node ageEle = doc.getElementsByTagName("age").item(1);
		// 2.��ȡ�ýڵ�ĸ��ڵ�
		// 3.���ø��ڵ�ķ����Ƴ��ýڵ�
		ageEle.getParentNode().removeChild(ageEle);
		// 4.ͬ������
		Transformer tf = TransformerFactory.newInstance().newTransformer();
		tf.transform(new DOMSource(doc), new StreamResult("src/xmlStudy/lesson/NewFile.xml"));
	
	}
	
	// ����Ԫ������
	public static void setAtt(Document doc) throws TransformerFactoryConfigurationError, TransformerException {
		// 1.��ȡ�ڵ�
		Node item = doc.getElementsByTagName("student").item(1);
		// 2.�ѽڵ�ת����Ԫ������
		Element ele = (Element)item;
		// 3.����Ԫ������
		ele.setAttribute("ID", "setid");
		// 4.ͬ������
		Transformer tf = TransformerFactory.newInstance().newTransformer();
		tf.transform(new DOMSource(doc), new StreamResult("src/xmlStudy/lesson/NewFile.xml"));
		
	}
	

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException, TransformerFactoryConfigurationError, TransformerException {
		/**
		 * 1.������������
		 * 2.ͨ����������������
		 * 3.ͨ���������õ�document����
		 */
		
		// 1.������������
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		// 2.ͨ����������������
		DocumentBuilder db = dbf.newDocumentBuilder();
		// 3.ͨ���������õ�document����
		Document doc = db.parse("src/xmlStudy/lesson/NewFile.xml");
		
		// ��ȡxml�ڵ�����
		read(doc);
		// �޸�xml�ĵ��ڵ�����
		edit(doc);
		// ��ӽڵ�
		add(doc);
		// ɾ���ڵ�
		del(doc);
		// ����Ԫ������
		setAtt(doc);
		
		
		
		
		
		
		
		
		
	}

}
