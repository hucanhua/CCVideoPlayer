package com.ccibs.ccvideoplayer.bean;

import java.util.ArrayList;

public class GameBean {
	/**
	 * "ID": "137835997648000622",
    "NAME": "���˰�DNF����Ӱ֮�������˲�����ʾ����aa",
    "SYNOPSIS": "���˺�涯�����Ρ���Ӱ֮�������ɳ����뺫�����Ķ��������ңʣã����Ͽ�����������ʽ�س����˲�����ʾ��Ƶ��������ʹ�ù�����Զ�̹�����ְҵ��������ְҵ�в����Ѷ���ߵ�һ��ְҵ�����˵�ս����ΪƮ�ݣ�������ս��������Ӱȥ���٣���ɧ����λ�õ���ͷʹ���ѡ���;����������ǡ��ŷ��ݡ���ս����",
    "TYPE": "2",
    "ADDTIME": "2013-09-05 01:45:03",
    "PIC": "http://images.17173.com/2013/vlog/20130903/caifeiyang0911_1869318_2.jpg",
    "PICPATH": "",
    "RANKING": "",
    "CATEGORY": "24",
    "TIME": "",
    "LABEL": "��Ӱ֮�� DNF �������� ���� �� aa",
    "RATE": "",
    "STATUS": "0",
    "TOP": "0",
    "RR": "1",
	 */
	private String id,name,synopsis,pic,label,type,videopath,htmlpath;
	private ArrayList<GameBean> gameBeanList;//��ص���Ƶ����
	private PageBean pageBean;
	/*================================================*/
	
	
	public PageBean getPageBean() {
		return pageBean;
	}
	
	public void setPageBean(PageBean pageBean) {
		this.pageBean = pageBean;
	}
	public String getVideopath() {
		return videopath;
	}


	public void setVideopath(String videopath) {
		this.videopath = videopath;
	}

	public String getHtmlpath() {
		return htmlpath;
	}

	public void setHtmlpath(String htmlpath) {
		this.htmlpath = htmlpath;
	}


	public ArrayList<GameBean> getGameBeanList() {
		return gameBeanList;
	}

	public void setGameBeanList(ArrayList<GameBean> gameBeanList) {
		this.gameBeanList = gameBeanList;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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

	public String getSynopsis() {
		return synopsis;
	}

	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}

	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}
	
}
