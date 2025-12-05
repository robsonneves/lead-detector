package br.com.lead_detector.lead_detector

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients

@SpringBootApplication
@EnableFeignClients
class LeadDetectorApplication

fun main(args: Array<String>) {
	runApplication<LeadDetectorApplication>(*args)
}
