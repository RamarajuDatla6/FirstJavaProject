package com.my.programs;

public class CompBranch {
    String branchName;
    Sessions sessions;

    public CompBranch(String branchName, Sessions sessions) {
        this.branchName = branchName;
        this.sessions = sessions;
    }

    public String getBranchName() {
        return branchName;
    }

    public Sessions getSessions() {
        return sessions;
    }

}
