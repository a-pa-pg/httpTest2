package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @PostMapping("/sample")
    public void handleWebhook(@RequestBody String payload) {
        // リクエストの処理を実装する
        // payloadをデータベースに保存するなどの操作を行う
    	System.out.println("payloadは　"
    			+ ""+payload);
    	
    	
    }
}







