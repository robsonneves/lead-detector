package br.com.lead_detector.lead_detector

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class LeadDetectorApplication

fun main(args: Array<String>) {
	runApplication<LeadDetectorApplication>(*args)
}
