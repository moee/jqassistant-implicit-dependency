# jqassistant implicit dependencies

This is a minimal example to demonstrate "implicit" dependencies in jQAssistant.

In [`Service`](./src/main/java/org/example/Service.java) there is no import
of [`Product`](./src/main/java/org/example/domain/Product.java), as this type
is never used for a variable assignment or in method signatures.

However, as `Service` calls `transaction.getProduct().getId()` in order to determine
the product id, jQAssistant creates a `DEPENDS_ON` relationship from `Service` to `Product`.

## How to run it

`mvn clean install`