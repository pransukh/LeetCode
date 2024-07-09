class JOB:
    def __init__(self, job, profit):
        self.job = job
        self.profit = profit

class Profile:
    def otherMethod():
        print("called")
    def max_profit_assignment(self,difficulty, profit, worker):
        jobs = [JOB(difficulty[i], profit[i]) for i in range(len(difficulty))]

        n = len(worker)
        i = 0
        current_profit = 0
        max_profit = 0

        for able in worker:
            while i < n:
                if jobs[i].job <= able:
                    current_profit = max(current_profit, jobs[i].profit)
                i += 1
            i = 0

            print(current_profit)
            max_profit += current_profit
            current_profit = 0
        self.otherMethod(self)
        return max_profit




if __name__ == "__main__":
    difficulty = [5, 50, 92, 21, 24, 70, 17, 63, 30, 53]
    profit = [68, 100, 3, 99, 56, 43, 26, 93, 55, 25]
    worker = [96, 3, 55, 30, 11, 58, 68, 36, 26, 1]
    profile = Profile()
    print(dir(profile))
    print(profile.max_profit_assignment(difficulty, profit, worker))
