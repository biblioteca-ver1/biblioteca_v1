import com.biblioteca.model.book.BookModel;
import com.biblioteca.service.book.BookService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.context.WebApplicationContext;

import javax.annotation.Resource;
import java.util.Iterator;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/spring/*.xml")
public class BookServiceTest {

    @Autowired
    private WebApplicationContext webApplicationContext;

    @Resource(name = "bookService")
    private BookService bookService;

    @Test
    public void getBookList() throws Exception{
        System.out.println("=========== BookServiceTest ===========");

        List list = bookService.getBookList();
        Iterator iterator = list.iterator();

        while(iterator.hasNext()){
            BookModel bookModel = (BookModel) iterator.next();

            System.out.println("======================");
            System.out.println("title : " + bookModel.getTitle());
            System.out.println("======================");
        }

    }


}
