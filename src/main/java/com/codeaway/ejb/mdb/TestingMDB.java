package com.codeaway.ejb.mdb;

import java.io.IOException;
import java.util.Properties;

import javax.ejb.CreateException;
import javax.ejb.MessageDrivenBean;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

import weblogic.ejb.GenericMessageDrivenBean;
import weblogic.ejbgen.ForeignJmsProvider;
import weblogic.ejbgen.MessageDriven;

/**
 * 
 * Test MDB
 * 
 */
@MessageDriven(ejbName = "TestingMDB", destinationJndiName = "jms.testQueue", destinationType = "javax.jms.Queue", defaultTransaction = MessageDriven.DefaultTransaction.REQUIRED, transactionType = MessageDriven.MessageDrivenTransactionType.CONTAINER)
public class TestingMDB extends GenericMessageDrivenBean implements MessageDrivenBean, MessageListener {

	private static final long serialVersionUID = 1L;

	@Override
	public void ejbCreate() throws CreateException {

	}

	/**
	 * Reads and stores additional properties
	 * 
	 * @throws IOException
	 */
	private void extraConfiguration(Properties envProps) throws IOException {


	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.jms.MessageListener#onMessage(javax.jms.Message)
	 */
	@Override
	public void onMessage(Message message) {

		try {
			TextMessage textMessage = (TextMessage) message;
			
		} catch (Throwable e) {
			getMessageDrivenContext().setRollbackOnly();
		}

	}

}