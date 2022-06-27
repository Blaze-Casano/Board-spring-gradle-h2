package Blaze.devBoard.Controller;


import Blaze.devBoard.domain.Board;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import Blaze.devBoard.service.BoardService;

@Controller

@RequestMapping("/board/**")
@RequiredArgsConstructor // 추가1
public class BoardController {

    private final BoardService service; //추가2

    @GetMapping("/hello")
    public String Hello() {
        return "/boards/hello";
    }

    // 추가3
    @GetMapping("/test")
    public String test(Model model) {
        model.addAttribute("cnt", service.boardCount());
        model.addAttribute("test", service.boardList());

        return "/boards/hello";
    }
    @GetMapping("/main")
    public String main(Model model) {
        model.addAttribute("list", service.boardList());

        return "/boards/main";
    }
    
    @GetMapping("/view")
    public String viewBoard(Model model, Long boardId) {
        service.viewCount(boardId); 
        model.addAttribute("halo", service.getBoard(boardId));

        return "/boards/view";
    }
    
    @GetMapping("/upload")
    public String uploadBoardForm(){
        return "/boards/upload";
    }

    @PostMapping("/upload")
    public String uploadBoard(Board board){
        service.uploadBoard(board);
        return "redirect:/board/main"; //주소이기때문에 board
    }
    @GetMapping("/update")
    public String updateBoardForm(Model model, Long boardId) {
        model.addAttribute("update", service.getBoard(boardId));

        return "/boards/update";
    }

    @PostMapping("/update")
    public String updateBoard(Board board) {
        service.updateBoard(board);
        return "redirect:/board/main";
    }

    @GetMapping("/delete")
    public String deleteBoard(Long boardId) {
        service.deleteBoard(boardId);
        return "redirect:/board/main";
    }
}
//JDBC Port : 8070

//http://localhost:8070/h2-console/

//jdbc:h2:file:C:/Workspace/blaze-board/h2data

/** @Controller 어노테이션: 컨트롤러 역할을 수행하는 클래스라는 것을 명시한다.

@RequestMapping 어노테이션: "/board/"로 접근하는 url 처리를 이 클래스인 BoardController 에서 맡는다고 알려준다.

@GetMapping 어노테이션: "/hello"로 접근하는 url 처리를 이 클래스인 BoardController 에서 맡는다고 알려준다. */


/** @RequestMapping("/board/") 에서 가 의미하는 건 무엇일까?

주소가 localhost:8080/board/로 시작한다면, /board/ 뒤에 블라블라~~ 더 긴 주소가 와야 한다는 것이다.

그래서 @GetMapping 을 통해 뒤에 url 을 붙여줬고, 따라서 주소창에 localhost:8080/board/hello 를 치면 @GetMapping 에 해당되는 클래스인 Hello를 실행하게 된다.

Hello 객체의 return 값은 "/boards/hello" 인데, 이는 templates>boards 폴더에 들어가 hello 라는 이름을 가진 파일을 띄우라는 의미다.

IntelliJ 우측 상단에 있는 초록색 재생 버튼을 눌러 스프링부트를 구동하고

크롬 창에 http://localhost:8070/board/hello 를 쳐보면

properties 에서 변경
추가 Server.port = 8070


spring 버전이 2.5.7 이상일경우 properties에 패턴 추가.
spring.mvc.pathmatch.matching-strategy=ant_path_matcher

*/


