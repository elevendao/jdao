/**
 * 版权所有：liushuai
 * 项目名称:demo
 * 创建者: liushuai
 * 创建日期: 2014-3-27
 * 文件说明:
 * 最近修改者：liushuai
 * 最近修改日期：2014-3-27
 */
package com.edao.codes.patterns.mediator;

/**
 * @author liushuai
 *
 */
public class Guest {

	boolean isSpeaking;
	Mediator mediator;
	
	public Guest(Mediator mediator) {
		this.mediator = mediator;
	}
	
	public void speak() {
		mediator.guestSpeak();
	}
	
	public void stop() {
		mediator.guestStop();
	}
	
	public boolean isSpeaking() {
		return isSpeaking;
	}
	
	public void setSpeaking(boolean isSpeaking) {
		this.isSpeaking = isSpeaking;
	}
}
