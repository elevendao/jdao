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
public class MediatorTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Mediator mediator = new Mediator();
		Host host = new Host(mediator);
		Guest guest = new Guest(mediator);

		mediator.registHost(host);
		mediator.registGuest(guest);
		
		host.speak();
		guest.speak();
		host.stop();
		guest.speak();
		host.speak();
	}

}
