package org.example;
import org.junit.Test;
import java.util.*;
import static org.junit.Assert.*;
public class TodoBusinessImplStub {
    @Test
    public void test(){
        TodoService todoServiceStub = new TodoServiceStub();
        TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceStub);
        List<String> filtereTools = todoBusinessImpl.retrieveTodoRelatedToString("Dummy");
        assertEquals(2,filtereTools.size());
    }
}
