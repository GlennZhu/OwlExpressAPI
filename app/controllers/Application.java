package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render("Your new application is ready."));
    }

    public static Result getStudentsWithImg(String imgUrl) {
        try {
            return ok();
        } catch (Exception e) {
            return internalServerError();
        }
    }

    public static Result getStudentsWithName(String name) {
        return ok();
    }

    public static Result postEmails(String emailAddress, String imgUrl) {
        return ok();
    }
}
