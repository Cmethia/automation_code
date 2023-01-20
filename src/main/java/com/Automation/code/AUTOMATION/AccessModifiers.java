package com.Automation.code.AUTOMATION;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class AccessModifiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=10;
int b=20;
int c=30;
int d=40;
if(d<b && d<c && d<a) {
	System.out.println("the smallest number is d:" +d );
}else if (b<c && b<a && b<d) {
	System.out.println("the smallest number is b:" +b);
}else if (c<b && c<d && c<a) {
	System.out.println("the \"the smallest number is c:\"");
}else {
	System.out.println("the smallest number is a:" +a);
}
		

	}
}


