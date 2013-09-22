package com.ccibs.ccvideoplayer.bean;

import java.util.ArrayList;

public class BookBean {
	
	/**
	 "ID": "137705321473080622",
    "NAME": "��Խ����",
    "PIC": "http://vipbook.sinaedge.com/bookcover/pics/166/cover_cc48625bbf9b55ed662a5a0a02674f35.jpg",
    "URL": "http://vip.book.sina.com.cn/book/index_230310.html",
    "AUTHOR": "ޱޱ",
    "TYPE": "��������",
    "STATUS": "10",
    "PRESS": "�������ճ�����",
    "NEWTIME": "2013-03-01 21:53:12",
    "SYNOPSIS": "����Խ���򡷡���һ�������������鸣���顣 �����ĳɹ�������ѧ����ܰ�����鰮����£���ֻ��Ҫ�����Ķ�����ӣ�����ѧ����ϧ��ѧ���ѧ�ᰮ�뱻����ѧ��ѡ��ѧ�������ѧ�����һ��֮����Ҹ��� 150�����������С���£����������������س����������ҵ����������е������İ���",
    "KEYWORDS": "��־ ���",
    "STATE": "ȫ��",
    "TOP": "",
    "NUM": "81"
	 */
	
	private String id,name,pic,url,author,type,press,keywords,synopsis,state,num;
	

	private ArrayList<BookPageBean> bookPageBeanList;

	public ArrayList<BookPageBean> getBookPageBeanList() {
		return bookPageBeanList;
	}

	public void setBookPageBeanList(ArrayList<BookPageBean> bookPageBeanList) {
		this.bookPageBeanList = bookPageBeanList;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPress() {
		return press;
	}

	public void setPress(String press) {
		this.press = press;
	}

	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public String getSynopsis() {
		return synopsis;
	}

	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}


	

}
