# Money transfer service


## Technologies and libraries:

## Spring Framework:
Spring Boot: Used to create the main application (TransferApplication).
Spring Web (Spring MVC): Used to create REST API controllers (@RestController, @RequestMapping, @GetMapping, @PostMapping, etc.).
Spring Data JPA: Used to work with the database using JPA repositories (JpaRepository).
Spring Validation: Used to validate data passed in requests (@Valid, @NotBlank, @Min, @Pattern, etc.).
Spring Transaction Management: Transaction management, including the use of @Transactional and @Propagation annotations.

## Hibernate:
Used as a JPA implementation for working with a database.
Optimistic Locking (@OptimisticLocking, @Version): Used to ensure data integrity during competitive changes.
Embedded objects (@Embedded, @AttributeOverrides): Used to embed complex data types (eg Amount).

## Java Persistence API (JPA):
JPA annotations: @Entity, @Table, @Id, @GeneratedValue, @Column, @Embeddable are used to map classes to database tables.

## Lombok:
Used to automatically generate getters, setters, constructors, toString, equals, hashCode methods, etc. using @Data, @NoArgsConstructor, @Getter, @Setter annotations.

## JUnit and Mockito:
Used to write unit tests (@Test, @BeforeAll, @ParameterizedTest, Mockito.mock, Mockito.when).
SpringRunner: Used to run tests in the Spring context.

## Java EE Validation API:
Validation annotations: Used to check the correctness of data (@NotBlank, @Min, @Pattern, @Length).
