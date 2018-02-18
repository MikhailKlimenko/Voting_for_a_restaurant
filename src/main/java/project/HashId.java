package project;

public interface HashId {
    Long getId();

    void setId(Long id);

    default boolean isNew() {
        return getId() == null;
    }
}
