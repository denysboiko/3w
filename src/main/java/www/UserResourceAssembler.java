package www;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@Component
class UserResourceAssembler implements RepresentationModelAssembler<User, EntityModel<User>> {

    @Override
    public EntityModel<User> toModel(User user) {

        return new EntityModel<>(user,
                linkTo(methodOn(Controller.class).getUser(user.getId())).withSelfRel(),
                linkTo(methodOn(Controller.class).getUsers()).withRel("users"));
    }
}
