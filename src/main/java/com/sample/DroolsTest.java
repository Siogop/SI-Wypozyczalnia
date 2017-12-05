package com.sample;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

import org.kie.api.KieServices;
import org.kie.api.logger.KieRuntimeLogger;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

/**
 * This is a sample class to launch a rule.
 */
public class DroolsTest {

    public static final void main(String[] args) {
        try {
            // load up the knowledge base
	        KieServices ks = KieServices.Factory.get();
    	    KieContainer kContainer = ks.getKieClasspathContainer();
        	KieSession kSession = kContainer.newKieSession("ksession-rules");
        	KieRuntimeLogger kLogger = ks.getLoggers().newFileLogger(kSession, "test");
            // go !
            /*Message message = new Message();
            message.setMessage("Hello World");
            message.setStatus(Message.HELLO);
            kSession.insert(message); */
        	Klient klient = new Klient(true);
        	SimpleDateFormat sdf = new SimpleDateFormat("yyyy MM dd");
        	Calendar date1 = new GregorianCalendar(2013,0,31);
        	Calendar date2 = new GregorianCalendar(2013,3,31);
        	Rezerwacja rezerwacja = new Rezerwacja(klient, date1, date2, 3, true, true, Kategoria.A);
        	//kSession.insert(rezerwacja);
            kSession.fireAllRules();
            kLogger.close();
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

}
