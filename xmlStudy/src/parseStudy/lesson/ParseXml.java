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
	
	// 读取xml节点内容
	public static void read(Document doc) {
		// 4.获取具体的节点列表集合
		NodeList list = doc.getElementsByTagName("name");
		// 5.获取集合中的具体某一项
		Node name = list.item(0);
		// 6.获取项目内容
		System.out.println(name.getTextContent());
		
	}
	
	// 修改xml节点内容
	public static void edit(Document doc) throws TransformerFactoryConfigurationError, TransformerException {
		// 获取节点集合
		NodeList list = doc.getElementsByTagName("age");
		// 获取集合具体某一项
		Node ageNode = list.item(0);
		// 修改项目内容
		ageNode.setTextContent("300");
		// 从内存写到文档做同步操作
		Transformer tf = TransformerFactory.newInstance().newTransformer();
		tf.transform(new DOMSource(doc), new StreamResult("src/xmlStudy/lesson/NewFile.xml"));
		
	}
	
	// 添加xml节点
	public static void add(Document doc) throws TransformerFactoryConfigurationError, TransformerException {

		// 1.创建元素
		Element addressEle = doc.createElement("address");
		addressEle.setTextContent("上海");
		// 2.获取节点列表
		// 3.获取节点列表中的指定项
		Node list = doc.getElementsByTagName("student").item(0);
		// 4.把元素添加进指定节点
		list.appendChild(addressEle);
		// 5.把内存的数据同步到xml
		Transformer tf = TransformerFactory.newInstance().newTransformer();
		tf.transform(new DOMSource(doc), new StreamResult("src/xmlStudy/lesson/NewFile.xml"));
	
	}
	
	// 删除节点
	public static void del(Document doc) throws TransformerFactoryConfigurationError, TransformerException {
		// 1.获取要删除的节点
		Node ageEle = doc.getElementsByTagName("age").item(1);
		// 2.获取该节点的父节点
		// 3.调用父节点的方法移出该节点
		ageEle.getParentNode().removeChild(ageEle);
		// 4.同步操作
		Transformer tf = TransformerFactory.newInstance().newTransformer();
		tf.transform(new DOMSource(doc), new StreamResult("src/xmlStudy/lesson/NewFile.xml"));
	
	}
	
	// 设置元素属性
	public static void setAtt(Document doc) throws TransformerFactoryConfigurationError, TransformerException {
		// 1.获取节点
		Node item = doc.getElementsByTagName("student").item(1);
		// 2.把节点转换成元素类型
		Element ele = (Element)item;
		// 3.设置元素属性
		ele.setAttribute("ID", "setid");
		// 4.同步操作
		Transformer tf = TransformerFactory.newInstance().newTransformer();
		tf.transform(new DOMSource(doc), new StreamResult("src/xmlStudy/lesson/NewFile.xml"));
		
	}
	

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException, TransformerFactoryConfigurationError, TransformerException {
		/**
		 * 1.创建解析工厂
		 * 2.通过工厂创建解析器
		 * 3.通过解析器得到document对象
		 */
		
		// 1.创建解析工厂
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		// 2.通过工厂创建解析器
		DocumentBuilder db = dbf.newDocumentBuilder();
		// 3.通过解析器得到document对象
		Document doc = db.parse("src/xmlStudy/lesson/NewFile.xml");
		
		// 读取xml节点内容
		read(doc);
		// 修改xml文档节点内容
		edit(doc);
		// 添加节点
		add(doc);
		// 删除节点
		del(doc);
		// 设置元素属性
		setAtt(doc);
		
		
		
		
		
		
		
		
		
	}

}
