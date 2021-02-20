package com.yash.yashwant.first;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class AnagramController {
    @GetMapping("/check/{a}/{b}")
    public Boolean check(@PathVariable String a, @PathVariable String b){

        AnagramChecker instance = new AnagramChecker();
        Boolean result = instance.isAnagram(a,b);
        return result;
    }



}
