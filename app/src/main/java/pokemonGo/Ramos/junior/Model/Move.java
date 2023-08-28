package pokemonGo.Ramos.junior.Model;

import java.util.List;

public class Move {
    private  MoveX move;
    private List<VersionGroupDetail> version_group_details;

    public MoveX getMove() {
        return move;
    }

    public void setMove(MoveX move) {
        this.move = move;
    }

    public List<VersionGroupDetail> getVersion_group_details() {
        return version_group_details;
    }

    public void setVersion_group_details(List<VersionGroupDetail> version_group_details) {
        this.version_group_details = version_group_details;
    }
}
