package com.example.demo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {

	@GetMapping("/test")
	public String test() {
		return "App Version V3";
	}
	
	@GetMapping("/read")
	public String getFileContent() throws IOException {
		return Files.readString(Path.of("/data/test.txt"));
	}
}
