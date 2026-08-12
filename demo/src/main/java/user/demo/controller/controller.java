package user.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import user.demo.dto.UserDto;
import java.util.List;

@Controller
@RestController
@RequestMapping("/api/usuarios")
public class controller {
    @GetMapping
    public ResponseEntity<List<UserDto>> obtenerTodos() {
        List<UserDto> usuarios = List.of(
                new UserDto(1L, "Ana Gómez", "ana.gomez@example.com"),
                new UserDto(2L, "Carlos López", "carlos.lopez@example.com")
        );
        return ResponseEntity.ok(usuarios);
    }
    @GetMapping("/{id}")
    public ResponseEntity<UserDto> obtenerPorId(@PathVariable Long id) {
        UserDto usuario = new UserDto(id, "Usuario " + id, "usuario" + id + "@example.com");
        return ResponseEntity.ok(usuario);
    }
}
