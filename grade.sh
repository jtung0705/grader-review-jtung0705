CPATH='.:lib/hamcrest-core-1.3.jar:lib/junit-4.13.2.jar'

rm -rf student-submission
rm -rf grading-area

mkdir grading-area
mkdir student-submission
git clone $1 student-submission

files=`find student-submission -name "*.java"`
for file in $files
    do
        if [[ -f $file && $file == **/ListExamples.java* ]]
        then
        echo 'Found file'
        else
        echo "Did not find ListExamples.java file"
        fi
    done
echo "Finished cloning"

cp student-submission/ListExamples.java grading-area
cp TestListExamples.java grading-area
cp -r lib grading-area 
cd grading-area/

javac -cp ".;lib/hamcrest-core-1.3.jar;lib/junit-4.13.2.jar" *.java > h.txt
java -cp ".;lib/junit-4.13.2.jar;lib/hamcrest-core-1.3.jar" org.junit.runner.JUnitCore TestListExamples
# Draw a picture/take notes on the directory structure that's set up after
# getting to this point, find out how to grep
# Then, add here code to compile and run, and do any post-processing of the
# tests