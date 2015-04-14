import com.massivecraft.factions.api;

/**
 * Represents all the ranks a {@link com.massivecraft.factions.api.IFPlayer} can have within a faction
 * 
 */
public enum Rank {
    /**
     * A player with this rank owns the faction
     * <p>
     * There can only be one owner
     * Owners have the highest rank, and have permission to do almost anything in their faction.
     * Owners can do anything moderators can do, but can also:
     * <ul>
     *   <li>Rename the Faction</li>
     *   <li>Premote or demote moderators</li>
     *   <li>Transfer ownership of the faction</li>
     *   <li>Kick moderators</li>
     * </ul>
     * </p>
     */
    OWNER,
    /**
     * A player with this rank moderates the Faction<p>
     * <p>
     * Moderators have the second highest rank and have various administrative permissions
     * Moderators can usually do anything members can do.
     * The exact permissions moderators have vary depending on the implementation.
     * </p>
     */
    MODERATOR,
    /**
     * A member in the faction.
     * <p>
     * Members are the default rank in most implementations.
     * Members can usually break and place blocks.
     * The exact permissions members have vary depending on the implementation.
     * </p>
     */
    MEMBER,
    /**
     * A recruit in the faction.
     * <p>
     * Recruits <b>may or may not be implemented</b>.
     * Recruits are the default rank in some implementations.
     * Recruits usually only have the permission to interact with blocks.
     * The exact permissions very depending on the implementation.
     * </p>
     */
    RECRUIT;
}