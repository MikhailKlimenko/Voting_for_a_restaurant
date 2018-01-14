package project.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import project.model.Menu;
import project.model.Restaurant;
import project.model.User;
import project.model.Votes;

import java.util.List;

public class zspring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring/spring-app.xml");
        ctx.refresh();

        MenuService menuService = ctx.getBean(MenuService.class);
        List<Menu> menuServiceList = menuService.getAll();
        System.out.println();
        System.out.println("----------------------------------------------------------");
        for (Menu m : menuServiceList) {
            System.out.println(m);
        }
        System.out.println("----------------------------------------------------------");
        System.out.println();

        RestaurantService restaurantService = ctx.getBean(RestaurantService.class);
        List<Restaurant> restaurants = restaurantService.getAll();
        System.out.println();
        System.out.println("----------------------------------------------------------");
        for (Restaurant r : restaurants) {
            System.out.println(r);
        }
        System.out.println("----------------------------------------------------------");
        System.out.println();

        UserService userService = ctx.getBean(UserService.class);
        List<User> users = userService.getAll();
        System.out.println();
        System.out.println("----------------------------------------------------------");
        for (User user : users) {
            System.out.println(user);
        }
        System.out.println("----------------------------------------------------------");
        System.out.println();


        VotesService votesService = ctx.getBean(VotesService.class);
        List<Votes> votes = votesService.getAll();
        System.out.println();
        System.out.println("----------------------------------------------------------");
        for (Votes v : votes) {
            System.out.println(v);
        }
        System.out.println("----------------------------------------------------------");
        System.out.println();

    }
}
