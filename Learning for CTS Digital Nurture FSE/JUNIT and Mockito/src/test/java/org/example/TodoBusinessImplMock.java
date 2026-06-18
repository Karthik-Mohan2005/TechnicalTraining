package org.example;
import org.junit.Test;
import java.util.*;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;
public class TodoBusinessImplMock {
    @Test
    public void test(){
        TodoService todoServiceMock = mock(TodoService.class);
        when(todoServiceMock.retrieveTodo("Dummy"))
                .thenReturn(Arrays.asList(
                        "Learn Spring MVC",
                        "Learn Spring",
                        "Learn to Dance"
                ));
        TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceMock);
        List<String> filtereTools = todoBusinessImpl.retrieveTodoRelatedToString("Dummy");
        assertEquals(2,filtereTools.size());
    }

    @Test
    public void testwithZero(){
        TodoService todoServiceMock = mock(TodoService.class);
        when(todoServiceMock.retrieveTodo("Dummy"))
                .thenReturn(Arrays.asList());
        TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceMock);
        List<String> filtereTools = todoBusinessImpl.retrieveTodoRelatedToString("Dummy");
        assertEquals(0,filtereTools.size());
    }
}
