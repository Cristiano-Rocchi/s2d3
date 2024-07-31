import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Product> products = List.of(
                new Product(1L, "Book 1", "Books", 150.0),
                new Product(2L, "Book 2", "Books", 90.0),
                new Product(3L, "Toy", "Baby", 50.0)
        );

        List<Product> filteredProducts = products.stream()
                .filter(product -> "Books".equals(product.getCategory()) && product.getPrice() > 100)
                .collect(Collectors.toList());

        filteredProducts.forEach(product -> System.out.println(product.getName()));
    }
}
