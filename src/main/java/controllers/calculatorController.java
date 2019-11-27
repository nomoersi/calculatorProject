package controllers;

import Service.CalculationService;
import operation.OperationType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class calculatorController {

    OperationType operationType = new OperationType();

    @RequestMapping(value = "/calculator", params = "add", method = RequestMethod.POST)
    public String add(@ModelAttribute("operationModel") OperationType operationType, Model model) {
        model.addAttribute("result", CalculationService.add(operationType));
        return "calculator";
    }

    @RequestMapping(value = "/calculator", params = "multiply", method = RequestMethod.POST)
    public String multiply(@ModelAttribute("operationModel") OperationType operationType, Model model) {
        model.addAttribute("result", CalculationService.multiply(operationType));
        return "calculator";
    }

    @RequestMapping(value = "/calculator", params = "divide", method = RequestMethod.POST)
    public String divide(@ModelAttribute("operationModel") OperationType operationType, Model model) {
        model.addAttribute("result", CalculationService.divide(operationType));
        return "calculator";
    }
}
