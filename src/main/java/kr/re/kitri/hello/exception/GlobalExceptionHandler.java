package kr.re.kitri.hello.exception;

import org.springframework.jdbc.BadSqlGrammarException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
@RestController
public class GlobalExceptionHandler {

    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
    public Map<String, String> handleMATMException(Exception e) {
        Map<String, String> resultMap = new HashMap<>();
        resultMap.put("result", "error");
        resultMap.put("error", e.toString());
        return resultMap;
    }

    @ExceptionHandler(BadSqlGrammarException.class)
    public Map<String, String> handleBSGException(Exception e) {
        Map<String, String> resultMap = new HashMap<>();
        resultMap.put("result", "error");
        resultMap.put("error", e.toString());
        return resultMap;
    }
}
