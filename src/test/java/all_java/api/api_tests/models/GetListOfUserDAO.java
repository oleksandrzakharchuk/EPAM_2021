package all_java.api.api_tests.models;

import lombok.Data;

import java.util.List;

@Data
public class GetListOfUserDAO {
    private Integer page;
    private Integer per_page;
    private Integer total;
    private Integer total_pages;
    private List<User> data;
    private Support support;

    @Data
    public static class User {
        private Integer id;
        private String email;
        private String first_name;
        private String last_name;
        private String avatar;
    }
    @Data
    public static class Support {
        private String url;
        private String text;

    }
}
