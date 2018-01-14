package project.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import project.service.MenuService;

@Controller
public class MenuRestController {
    private static final Logger log = LoggerFactory.getLogger(MenuRestController.class);

    private final MenuService menuService;

    @Autowired
    public MenuRestController(MenuService menuService) {
        this.menuService = menuService;
    }


}
