package org.full.abstractclass;

public class Match extends Cricket {

	private int homeScore, visitorScore;

	@Override
	void setHomeTeamscore(int score) {
		homeScore = score;
	}

	@Override
	void setHomeVisitorscore(int score) {
		visitorScore = score;
	}

	void matchResult() {
		if (homeScore > visitorScore) {
			System.out.println("HomeTeam Won the Match");
		} else {
			System.out.println("VisitorTeam Won the Match");
		}
	}

}
