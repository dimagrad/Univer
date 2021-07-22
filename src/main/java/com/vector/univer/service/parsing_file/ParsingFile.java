package com.vector.univer.service.parsing_file;

import com.vector.univer.entity.StudentEntity;

import java.io.ByteArrayOutputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class ParsingFile implements Callable<List<StudentEntity>> {

    private StudentHandler studentHandler = new StudentHandler();
    private List<StudentEntity> students = new ArrayList<>();

    public List<StudentEntity> call () throws Exception{
        RandomAccessFile reader = new RandomAccessFile("src/resources/Student_add.txt", "r");
        FileChannel channel = reader.getChannel();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int bufferSize = 1024;

        if (bufferSize > channel.size()) {

            bufferSize = (int) channel.size();
        }

        ByteBuffer buff = ByteBuffer.allocate(bufferSize);
        while (channel.read(buff) > 0) {
            out.write(buff.array(), 0, buff.position());
            buff.clear();
        }
        String fileContent = new String(out.toByteArray(), StandardCharsets.ISO_8859_1);
//        channel.read(buff);
//        buff.flip();
//
////        new String(buff.array())
//
//        channel.close();

//        String res = "";
//        int b = reader.read();
//        String s = reader.readLine();
//        String line = new String(s.getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8);
//
//
//        while (b != -1) {
//            res = res + (char) b;
//            b = reader.read();
//        }
//        System.out.println(res);
//        reader.close();

//        FileInputStream fis = new FileInputStream("src/resources/Student_add.txt");
//        FileChannel channel = fis.getChannel();
//        ByteBuffer buff = ByteBuffer.allocate(4096);
//        int r = channel.read(buff);
//
//        while (r != -1){
//
//            buff.flip();
//            while (buff.hasRemaining()){
//
//                System.out.println(buff.getChar());
//            }
//            buff.clear();
//            r = channel.read(buff);
//        }
//        fis.close();
//
//        String student;
//        BufferedReader bro = new BufferedReader(new FileReader("src/resources/Student_add.txt"));
//        System.out.println(bro);
//
//        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("src/resources/Student_add.txt"), "Cp1251"))) {
//
//            while ((student = br.readLine()) != null) {
//
//                students.add(studentHandler.handleStudent(student));
//            }
//        } catch (IOException ехс) {
//
//            System.out.println("Ошибка ввода-вывода: " + ехс);
//        }
//        System.out.println("Студенты считаны");
        return students;
    }
}
