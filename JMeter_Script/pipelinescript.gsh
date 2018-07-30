node {
	stage 'Run JMeter Test'
	sh '/home/ubuntu/apache-jmeter-4.0/bin/jmeter.sh -n -t /home/ubuntu/apache-jmeter-4.0/bin/ATM_Locator_20180719.jmx -l /home/ubuntu/apache-jmeter-4.0/bin/test.jtl'
}
