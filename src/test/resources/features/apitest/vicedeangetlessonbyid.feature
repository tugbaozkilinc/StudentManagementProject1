@ApiGetLessonByVicedean
  Feature: Get_LessonById

    Scenario: TC01_Vicedean_Lesson

      Given send get request to get lesson
      Then validate lesson body