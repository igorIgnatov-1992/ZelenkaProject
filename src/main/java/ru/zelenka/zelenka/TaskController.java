package ru.zelenka.zelenka;



import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TaskController {
    private List<Task> tasks = new ArrayList<>();
    private Long nextId = 1L;

    @GetMapping("/task")
    public String task(Model model) {
        model.addAttribute("tasks", tasks);
        model.addAttribute("newTask", new Task());
        return "task";
    }

    @PostMapping("/add")
    public String addTask(@ModelAttribute Task newTask) {
        newTask.setId(nextId++);
        tasks.add(newTask);
        return "redirect:/task";
    }

    @PostMapping("/toggle/{id}")
    public String toggleTask(@PathVariable Long id) {
        tasks.stream()
        .filter(task -> task.getId().equals(id))
        .findFirst()
        .ifPresent(task -> task.setCompleted(!task.isCompleted()));
        return "redirect:/task";
    }
}
