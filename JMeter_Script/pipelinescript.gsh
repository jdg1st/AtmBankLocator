node {
	stage 'Run JMeter Test'
	sh '/home/ubuntu/apache-jmeter-4.0/bin/jmeter.sh -n -t /AtmBankLocator/JMeter_Script/ATM_Locator_20180719.jmx -l test.jtl'
}