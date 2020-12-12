package pf5.codehub.team5.webapp.mappers;

import org.springframework.stereotype.Component;
import pf5.codehub.team5.webapp.domain.User;
import pf5.codehub.team5.webapp.model.UserModel;

import java.time.LocalDate;

@Component
public class UserToUserModelMapper {

    public UserModel mapToUserModel(User user) {
        UserModel userModel = new UserModel();
//        userModel.setTitle(book.getTitle());
//        userModel.setAuthor(book.getAuthor().getFirstName() + " " + book.getAuthor().getLastName());
//        userModel.setYear(book.getYear());
//        userModel.setId(book.getId());
//        userModel.setCategory(book.getCategory() != null ? book.getCategory() : Category.DEFAULT);
//        userModel.setAuthorLastName(book.getAuthor().getLastName());
//        userModel.setAuthorFirstName(book.getAuthor().getFirstName());
//        userModel.setPublicationDate(LocalDate.of(Integer.parseInt(book.getYear()), 1, 1));
        return userModel;
    }
}
