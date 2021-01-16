import unittest
import grades

class Check(unittest.TestCase):

    def testCode(self):
        self.assertEqual(grades.calculateGrade(67), 'A')


if __name__ == '__main__':
    unittest.main()