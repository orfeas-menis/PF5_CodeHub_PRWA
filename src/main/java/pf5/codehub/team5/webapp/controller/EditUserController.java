package pf5.codehub.team5.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pf5.codehub.team5.webapp.model.UserModel;
import pf5.codehub.team5.webapp.service.UserService;

public class EditUserController {

    private static final String USER_ATTR = "user";
//    private static final String BOOKS_CATEGORIES = "booksCategories";

    @Autowired
    private UserService userService;

//    @PostMapping(value = "/books/{id}/delete")
//    public String deleteBook(@PathVariable Long id) {
//        bookService.deleteById(id);
//        return "redirect:/books";
//    }

    @GetMapping(value = "/owner/{id}/edit")
    public String editUser(@PathVariable Long id, Model model) {
        UserModel userModel = userService.findUser(id).get();
        model.addAttribute(USER_ATTR, userModel);
//        model.addAttribute(BOOKS_CATEGORIES, Category.values());
        return "pages/owner_edit";
    }

//    @PostMapping(value = "/books/edit")
//    public String editBook(BookModel bookModel) {
//        bookService.updateBook(bookModel);
//        return "redirect:/books";
//    }

}
