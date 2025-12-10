package builder.design.builder.task_query_builder;



@WithBuilder
public class QueryBuilder {
    private String select;
    private String from;
    private String where;
    private String join;
    private String orderBy;
    private String groupBy;

    private QueryBuilder(Builder builder){
        this.select= builder.select;
        this.from= builder.from;
        this.where= builder.where;
        this.join= builder.join;
        this.orderBy= builder.orderBy;
        this.groupBy= builder.groupBy;
    }
    public static Builder getBuilder(){
        return new Builder();
    }
    public static class Builder{
        private String select;
        private String from;
        private String where;
        private String join;
        private String orderBy;
        private String groupBy;

        public Builder select(String select){
            this.select=select;
            return  this;
        }
        public Builder from(String from){
            this.from=from;
            return  this;
        }
        public Builder where(String where){
            this.where=where;
            return  this;
        }
        public Builder join(String join){
            this.join=join;
            return  this;
        }
        public Builder orderBy(String orderBy){
            this.orderBy=orderBy;
            return  this;
        }
        public Builder groupBy(String groupBy){
            this.groupBy=groupBy;
            return  this;
        }
        public QueryBuilder build(){
            return new QueryBuilder(this);
        }
        public String toString() {
            StringBuilder query = new StringBuilder("SELECT " + select + " FROM " + from);
            if (join != null && !join.isEmpty()) {
                query.append(" ").append(join);
            }
            if (where != null && !where.isEmpty()) {
                query.append(" WHERE ").append(where);
            }
            if (groupBy != null && !groupBy.isEmpty()) {
                query.append(" GROUP BY ").append(groupBy);
            }
            if (orderBy != null && !orderBy.isEmpty()) {
                query.append(" ORDER BY ").append(orderBy);
            }
            return query.toString();
        }
    }
}
